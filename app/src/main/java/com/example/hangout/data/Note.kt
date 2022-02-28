/*

If you want to use Shared Preferences

1.Place
lateinit var sharedPre: SharedPreferences
in the class

2.Place
sharedPre = getSharedPreferences("data_stored", Context.MODE_PRIVATE)
in onCreate()


3.When use edit() create
val editor: SharedPreferences.Editor = sharedPre.edit()
then use it













 */