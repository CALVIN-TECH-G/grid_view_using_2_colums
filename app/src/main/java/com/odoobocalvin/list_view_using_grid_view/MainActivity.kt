package com.odoobocalvin.list_view_using_grid_view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.odoobocalvin.list_view_using_grid_view.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val list = ArrayList<grid_view_item>()

        list.add(grid_view_item(R.drawable.arts,"ARTS & CRAFTS","Students recycle would be waste such as polythene, straws, papers and plastics to make crafts like mats, masks, rosaries, necklaces, wrist bands, bags among others."))
        list.add(grid_view_item(R.drawable.bricks,"BRIQUETTE PRODUCTION","Briquettes are an alternative source of cooking fuel that can replace use of ordinary charcoal and firewood. This helps save the forests since it reduces cutting down of trees for wood fuel."))
        list.add(grid_view_item(R.drawable.foot,"CO CURICULAR","Physical Education provision at School, harness a ‘sporting culture where\n" +
                "children enjoy a wide variety of opportunities to take part in clubs and competitions applying the skills taught in their outdoor lessons."))
        list.add(grid_view_item(R.drawable.fish,"FISH FARMING","At the school premisses, we rear about 700 same sex fish which students feed twice a day on local and manufactured foods. The pond has a constant water inlet and outlet for a constant oxygen supply."))
        list.add(grid_view_item(R.drawable.mushroom,"MUSHROOM GROWING","A mushroom house is constructed from would-be  wasted plastic bottles and this is meant to encourage recycling. It is designed  with a top layer filled with soil used for vegetable growing in order to maximize space. Irrigation of the vegetables makes the mushroom house moist. Its completely light sealed as a condition for growth of mushrooms."))
        list.add(grid_view_item(R.drawable.paver,"PAVER MAKING", "A paver is block of compacted sand and cement laid in walkways and compounds. The school is blessed with a water channel connected to main roads in Namugongo. Channel collects run-off from neighbouring areas leading to a huge constant desposit of silt. \n" +
                "\n" +
                "The channel is dredged to get the silt that is used to make pavers."))
        list.add(grid_view_item(R.drawable.poultry,"POLYRT KEEPING","We cage about 100 kuroilers in two layer cages. Students under guidance of their fellow student project coordinators feed them twice a day. They grow for about 6 months and students feed on them to supplement their diet,"))
        list.add(grid_view_item(R.drawable.smartagri,"SMART AGRICULTURE","This involves use of a small piece of land while maximizing agricultural output eg Off ground gardens in which  help utilize space in homesteads by growing more vegetables in a small space."))

        val adapter = myAdapter(this, list)
        val grid = binding.myGrid

        grid.adapter = adapter

    }
}