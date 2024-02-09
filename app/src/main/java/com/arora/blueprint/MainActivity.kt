package com.arora.blueprint

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.arora.blueprint.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    private lateinit var contentArray:ArrayList<Content>
    private lateinit var name1:Array<String>
    private lateinit var name2:Array<String>
    private lateinit var name3:Array<String>
    private lateinit var name4:Array<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



        name1= arrayOf("Name of Survey","Name of Survey","Name of Survey","Name of Survey","Name of Survey","Name of Survey","Name of Survey","Name of Survey","Name of Survey","Name of Survey","Name of Survey","Name of Survey","Name of Survey","Name of Survey")
        name2= arrayOf("Lorem Ipsum Pvt.Ltd","Lorem Ipsum Pvt.Ltd","Lorem Ipsum Pvt.Ltd","Lorem Ipsum Pvt.Ltd","Lorem Ipsum Pvt.Ltd","Lorem Ipsum Pvt.Ltd","Lorem Ipsum Pvt.Ltd","Lorem Ipsum Pvt.Ltd","Lorem Ipsum Pvt.Ltd","Lorem Ipsum Pvt.Ltd","Lorem Ipsum Pvt.Ltd","Lorem Ipsum Pvt.Ltd","Lorem Ipsum Pvt.Ltd","Lorem Ipsum Pvt.Ltd")
        name3= arrayOf("Start Date","Start Date","Start Date","Start Date","Start Date","Start Date","Start Date","Start Date","Start Date","Start Date","Start Date","Start Date","Start Date","Start Date")
        name4= arrayOf("20/12/2023","20/12/2023","20/12/2023","20/12/2023","20/12/2023","20/12/2023","20/12/2023","20/12/2023","20/12/2023","20/12/2023","20/12/2023","20/12/2023","20/12/2023","20/12/2023")


        contentArray= arrayListOf<Content>()
        for (i in name1.indices){
            val c=Content(name1[i],name2[i],name3[i],name4[i])
            contentArray.add(c)



            binding.recycle.adapter=Adapter(contentArray)



            binding.recycle.layoutManager= LinearLayoutManager(this)
        binding.recycle.setHasFixedSize(true)


    }


    }

}