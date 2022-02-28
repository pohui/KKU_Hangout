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
import com.google.android.material.navigation.NavigationView
import com.example.hangout.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: com.example.hangout.databinding.ActivityMainBinding

    //RWChangeLocalFile

//    var sharedPre: SharedPreferences = this.getSharedPreferences("data_stored", Context.MODE_PRIVATE)
//    var a = Timber.i("ara : ${sharedPre}")
    lateinit var sharedPre: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        sharedPre = this.getSharedPreferences("data_stored", Context.MODE_PRIVATE)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.topheaderAndContent.toolbar)

        val drawerLayout: DrawerLayout = binding.drawerLayout
        val navView: NavigationView = binding.navView
        //do FragmentController
        val navController = findNavController(R.id.content_fragment_placeholder) // make R.id.content_fragment_placeholder to be host controller
        setupActionBarWithNavController(navController, appBarConfiguration) //set it up

        appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.nav_home, R.id.nav_about, R.id.nav_logout, R.id.nav_profile, R.id.nav_report
            ), drawerLayout
        )

        navView.setupWithNavController(navController)

    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.overflow, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.menuLogout -> {
                val editor: SharedPreferences.Editor = sharedPre.edit()
                editor.remove("Username")
                editor.remove("RememberMe")
                editor.remove("BypassWelcomePage")
                editor.apply()
                Toast.makeText(this, "You're logged out", Toast.LENGTH_SHORT).show()
                var intent = Intent(this, WelcomeActivity::class.java)
                startActivity(intent)
                finish()
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
    //todo: clear cache/data in setting menu to editor.clear()
    //todo: name on nav
    //todo: list view, search bar
    //todo: report from to google sheet
    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.content_fragment_placeholder)
        return navController.navigateUp(appBarConfiguration) || super.onSupportNavigateUp()
    }

//    fun logout() {
//
//        sharedPre = this.getSharedPreferences("data_stored", Context.MODE_PRIVATE)
//        editor.clear()
//        editor.commit()
//        Toast.makeText(this, "You're logged out", Toast.LENGTH_SHORT).show()
//        finish()
//        var intent = Intent(this, LoginActivity::class.java)
//        startActivity(intent)
//    }
}

