package com.example.hangout

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.hangout.databinding.ActivityMainBinding
import com.example.hangout.databinding.ActivityMainHeaderBinding
import com.example.hangout.databinding.DrawerHeaderBinding
import com.google.android.material.navigation.NavigationView
import timber.log.Timber

class MainActivity : AppCompatActivity() {
    private lateinit var binding_drawer: DrawerHeaderBinding
    private lateinit var binding_header: ActivityMainHeaderBinding
    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMainBinding

    //RWChangeLocalFile

//    var sharedPre: SharedPreferences = this.getSharedPreferences("data_stored", Context.MODE_PRIVATE)
//    var a = Timber.i("ara : ${sharedPre}")
    lateinit var sharedPre: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        sharedPre = this.getSharedPreferences("data_stored", Context.MODE_PRIVATE)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        setSupportActionBar(binding.topheaderAndContent.toolbar)
        setSupportActionBar(binding.header.toolbar)

        val drawerLayout: DrawerLayout = binding.drawerLayout
        val navView: NavigationView = binding.navView

        //do FragmentController
        val navController = findNavController(R.id.content_fragment_placeholder) // make R.id.content_fragment_placeholder to be host controller
        appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.nav_home, R.id.nav_about, R.id.nav_profile, R.id.nav_report
            ), drawerLayout
        )//bind nav pages to its configuration
        setupActionBarWithNavController(navController, appBarConfiguration) //set it up
        navView.setupWithNavController(navController)

    }
    /*up button can be pressed*/
    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.content_fragment_placeholder)
        return navController.navigateUp(appBarConfiguration) || super.onSupportNavigateUp()
    }

    /*create options menu*/
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.overflow, menu)
        return true
    }
    /*set items on options menu*/
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.menuLogout -> {
                val editor: SharedPreferences.Editor = sharedPre.edit()
                editor.remove("Username")
                editor.remove("RememberMe")
                editor.remove("BypassWelcomePage")
                editor.apply()
                Toast.makeText(this, "You're logged out", Toast.LENGTH_SHORT).show()
                val intent = Intent(this, WelcomeActivity::class.java)
                startActivity(intent)
                finish()
                true
            }
            R.id.menuSettings ->{
//                view: View -> view.findNavController().navigate(R.id.action_nav_home_to_cafeFragment)
//            view.findNavController().navigate(R.id.action_nav_home_to_cafeFragment)
//            Navigation.createNavigateOnClickListener(R.id.action_nav_home_to_cafeFragment)
            true
            }
//            R.id.mnuClearData ->{
//                val editor: SharedPreferences.Editor = sharedPre.edit()
//                editor.clear()
//                editor.apply()
//                Toast.makeText(this, "Data & Cache Cleared", Toast.LENGTH_SHORT).show()
//                true
//            }
            R.id.menuExit ->{
                //todo: use another function instead, because of can't replace the text
                    val alertOnExit = AlertDialog.Builder(this)
                    alertOnExit.setTitle("EXIT?")
                    alertOnExit.setMessage("Are you sure to close this application?")
                    alertOnExit.setPositiveButton("Quit"){ dialog, which ->
                        Toast.makeText(this,"Application Terminated!",Toast.LENGTH_SHORT).show()
                        finish()
                    }
                    alertOnExit.setNegativeButton("No"){ dialog, _ ->}
                    val dialog : AlertDialog = alertOnExit.create()
                    dialog.show()
                    true
                }
            else -> super.onOptionsItemSelected(item)
        }


    }

    override fun onResume() {
        super.onResume()
        Timber.i("ara : Run 'onResume' in 'MainActivity.kt'")
//        binding_drawer = DrawerHeaderBinding.inflate(layoutInflater)
//        binding_drawer.usernameDisplay.text = "I'm here, in Main activity just scroll down"

    }
    //todo: name on nav
    //todo: list view, search bar
    //todo: report from to google sheet


}

