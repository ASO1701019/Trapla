package jp.ac.asojuku.st.trapla

import android.net.Uri
import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() ,
        HomeFragment.OnFragmentInteractionListener,
        SearchFragment.OnFragmentInteractionListener,
        AddFragment.OnFragmentInteractionListener,
        FavoriteFragment.OnFragmentInteractionListener,
        UserFragment.OnFragmentInteractionListener
{

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_home -> {
//                message.setText(R.string.title_home)
                supportFragmentManager.beginTransaction()
                        .replace(R.id.framelayout,HomeFragment())
                        .commit()
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_add -> {
//                message.setText(R.string.title_add)
                supportFragmentManager.beginTransaction()
                        .replace(R.id.framelayout,AddFragment())
                        .commit()
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_search -> {
//                message.setText(R.string.title_search)
                supportFragmentManager.beginTransaction()
                        .replace(R.id.framelayout,SearchFragment())
                        .commit()
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_fab -> {
//                message.setText(R.string.title_fab)
                supportFragmentManager.beginTransaction()
                        .replace(R.id.framelayout,FavoriteFragment())
                        .commit()
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_user -> {
//                message.setText(R.string.title_user)
                supportFragmentManager.beginTransaction()
                        .replace(R.id.framelayout,UserFragment())
                        .commit()
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
        //初期表示
        supportFragmentManager.beginTransaction()
                .replace(R.id.framelayout,HomeFragment())
                .commit()
    }

    override fun onFragmentInteraction(uri: Uri) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
