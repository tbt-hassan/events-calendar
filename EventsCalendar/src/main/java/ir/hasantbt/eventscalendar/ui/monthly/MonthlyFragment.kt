package ir.hasantbt.eventscalendar.ui.monthly

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import ir.hasantbt.eventscalendar.R

class MonthlyFragment : Fragment() {

    companion object {
        fun newInstance() = MonthlyFragment()
    }

    private lateinit var viewModel: MonthlyViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_monthly, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(MonthlyViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
