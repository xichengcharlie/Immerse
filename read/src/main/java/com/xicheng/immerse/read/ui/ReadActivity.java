package com.xicheng.immerse.read.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.xicheng.immerse.foundation.uilib.viewdata.TextPaperViewData;
import com.xicheng.immerse.read.R;
import com.xicheng.immerse.read.viewmodel.ReadViewModel;

import java.util.ArrayList;

/**
 *
 */
public class ReadActivity extends AppCompatActivity {

    private ViewPager2 readView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_read);
        readView = findViewById(R.id.read_view);
        String text = "噫吁嚱，危乎高哉！\n" +
                "蜀道之难，难于上青天！\n" +
                "蚕丛及鱼凫，开国何茫然！\n" +
                "尔来四万八千岁，不与秦塞通人烟。\n" +
                "西当太白有鸟道，可以横绝峨眉巅。\n" +
                "地崩山摧壮士死，然后天梯石栈相钩连。\n" +
                "上有六龙回日之高标，下有冲波逆折之回川。\n" +
                "黄鹤之飞尚不得过，猿猱欲度愁攀援。\n" +
                "青泥何盘盘，百步九折萦岩峦。\n" +
                "扪参历井仰胁息，以手抚膺坐长叹。\n" +
                "\n" +
                "问君西游何时还？畏途巉岩不可攀。\n" +
                "但见悲鸟号古木，雄飞雌从绕林间。\n" +
                "又闻子规啼夜月，愁空山。\n" +
                "蜀道之难，难于上青天，使人听此凋朱颜！\n" +
                "连峰去天不盈尺，枯松倒挂倚绝壁。\n" +
                "飞湍瀑流争喧豗，砯崖转石万壑雷。\n" +
                "其险也如此，嗟尔远道之人胡为乎来哉！(也如此 一作：也若此)\n" +
                "\n" +
                "剑阁峥嵘而崔嵬，一夫当关，万夫莫开。\n" +
                "所守或匪亲，化为狼与豺。\n" +
                "朝避猛虎，夕避长蛇，磨牙吮血，杀人如麻。\n" +
                "锦城虽云乐，不如早还家。\n" +
                "蜀道之难，难于上青天，侧身西望长咨嗟";

        new ViewModelProvider
                .AndroidViewModelFactory(getApplication()).create(ReadViewModel.class);

        TextPaperViewData viewData = new TextPaperViewData(text, 0, text.length());
        ArrayList<TextPaperViewData> list = new ArrayList<>();
        list.add(viewData);
        list.add(viewData);
        list.add(viewData);
        list.add(viewData);
        list.add(viewData);

        readView.setAdapter(new ReadViewAdapter(list));
//        readView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
    }
}