package com.gahyeon.android_searchimageapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import com.gahyeon.android_searchimageapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        // binding.viewPager.adapter = ViewPager2Adapter(this@MainActivity)


        binding.apply {
            btnSearchImage.setOnClickListener {
                setFragment(SearchFragment())

            }
            btnMyArchive.setOnClickListener {
                setFragment(MyArchiveFragment())
            }
        }
        setFragment(SearchFragment())
    }

    private fun setFragment (frag: Fragment) {
        supportFragmentManager.commit {
            replace(R.id.view_pager, frag)
            setReorderingAllowed(true)
            addToBackStack("")
        }
    }

    private fun setUpSearchImageParameter(): HashMap<String, String> {
        val authKey = "82dc2e41393443716ed72b2b1779df01"

        return hashMapOf(
            "Authorization" to authKey,
            "query" to "",
            "sort" to "accuracy",
            "page" to "1",
            "size" to "80"
        )

    }
}