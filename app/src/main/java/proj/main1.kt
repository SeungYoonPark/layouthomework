package proj

import android.content.ClipData.Item
import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.view.inputmethod.InputBinding
import androidx.activity.result.ActivityResultLauncher
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import java.text.FieldPosition

class main1 : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinfind
    private val dataList = mutableListOf<SaleItem>()
    lateinit var activityResultLauncher: ActivityResultLauncher<Intent>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainbinding.inflate(layoutInflater)
        setContentView(binding.root)

        dataList.add(SaleItem(r.drawble.sample1, "산진 한달된 선풍기 팝니다", "이사가서 필요가 없어졌어요 급하게 내놓습니다", "대현동", 1000, "서울 서", 8 , ))
        dataList.add(SaleItem(r.drawble.sample1, "산진 한달된 선풍기 팝니다", "이사가서 필요가 없어졌어요 급하게 내놓습니다", "대현동", 1000, "서울 서", 8 , ))
        dataList.add(SaleItem(r.drawble.sample1, "산진 한달된 선풍기 팝니다", "이사가서 필요가 없어졌어요 급하게 내놓습니다", "대현동", 1000, "서울 서", 8 , ))
        dataList.add(SaleItem(r.drawble.sample1, "산진 한달된 선풍기 팝니다", "이사가서 필요가 없어졌어요 급하게 내놓습니다", "대현동", 1000, "서울 서", 8 , ))
        dataList.add(SaleItem(r.drawble.sample1, "산진 한달된 선풍기 팝니다", "이사가서 필요가 없어졌어요 급하게 내놓습니다", "대현동", 1000, "서울 서", 8 , ))
        dataList.add(SaleItem(r.drawble.sample1, "산진 한달된 선풍기 팝니다", "이사가서 필요가 없어졌어요 급하게 내놓습니다", "대현동", 1000, "서울 서", 8 , ))
        dataList.add(SaleItem(r.drawble.sample1, "산진 한달된 선풍기 팝니다", "이사가서 필요가 없어졌어요 급하게 내놓습니다", "대현동", 1000, "서울 서", 8 , ))
        dataList.add(SaleItem(r.drawble.sample1, "산진 한달된 선풍기 팝니다", "이사가서 필요가 없어졌어요 급하게 내놓습니다", "대현동", 1000, "서울 서", 8 , ))
        dataList.add(SaleItem(r.drawble.sample1, "산진 한달된 선풍기 팝니다", "이사가서 필요가 없어졌어요 급하게 내놓습니다", "대현동", 1000, "서울 서", 8 , ))
        dataList.add(SaleItem(r.drawble.sample1, "산진 한달된 선풍기 팝니다", "이사가서 필요가 없어졌어요 급하게 내놓습니다", "대현동", 1000, "서울 서", 8 , ))
        dataList.add(SaleItem(r.drawble.sample1, "산진 한달된 선풍기 팝니다", "이사가서 필요가 없어졌어요 급하게 내놓습니다", "대현동", 1000, "서울 서", 8 , ))


        binding.recycleVeiw.adapter = Item(dataList)

        val adapter = Item(dataList)
        binding.recyclerVeiw.adapter = adapter
        binding.recyclerVeiw.layoutManager = LinearLayoutManager(this)

        adapter.itemClick = object : Item.ItemClick{
            override fun onClick(veiw:View, position: int) {
                val intent = intent(this@main1, detail::class.java)
            }
        }
    }
}