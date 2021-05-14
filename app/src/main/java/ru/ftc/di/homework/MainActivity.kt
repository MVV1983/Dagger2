package ru.ftc.di.homework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import ru.ftc.di.homework.databinding.ActivityMainBinding
import ru.ftc.di.homework.presentation.MainState
import ru.ftc.di.homework.presentation.MainViewModel
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    //TODO: DI
    @Inject
    lateinit var viewModel: MainViewModel
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
		(application as MyApp).appComponent.inject(this)
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        binding.loadButton.setOnClickListener {
            viewModel.loadStrings()
        }

        viewModel.state.observe(this) { newState ->
            renderState(newState)
        }
    }

    private fun renderState(state: MainState) {
        when (state) {
			MainState.Loading -> {
				Toast.makeText(this, "loading", Toast.LENGTH_SHORT).show()
				binding.remoteText.text = ""
				binding.localText.text = ""
			}

			is MainState.Success -> {
				binding.remoteText.text = state.remoteString
				binding.localText.text = state.localString
			}
        }
    }
}