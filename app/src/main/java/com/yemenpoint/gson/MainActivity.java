package com.yemenpoint.gson;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.google.gson.Gson;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    String response = "[{\"ID_Products\":\"9397\",\"P_Name\":\"ديكلوبان 25 مجم تحاميل\",\"ID_Scientific\":\"229\",\"creator_name\":\"الشركة العالمية لصناعة الأدوية\",\"stored_name\":\"الشركة العالمية لصناعة الأدوية\",\"Scientific_Name\":\"ديكلوفيناك الصوديوم\",\"Image\":\"logo.png\",\"Description\":\"مضاد للالتهاب مسكن للالم خافض للحرارة \",\"P_Price\":\"340\",\"unit\":\"باكت\"},{\"ID_Products\":\"9824\",\"P_Name\":\"Loramycin 40mg\\/2ml Ampoules\",\"ID_Scientific\":\"255\",\"creator_name\":\"Exir Pharmaceutical Co\",\"stored_name\":\"مؤسسة سابكو للتجارة\",\"Scientific_Name\":\"جنتاميسين\",\"Image\":\"logo.png\",\"Description\":\"مضاد حيوي\",\"P_Price\":\"0\",\"unit\":\"باكت\"},{\"ID_Products\":\"12006\",\"P_Name\":\"اسيفام 40 مجم اقراص\",\"ID_Scientific\":\"609\",\"creator_name\":\"ميد فارما\",\"stored_name\":\"شركة العابد للتوريدات الطبية\",\"Scientific_Name\":\"فاموتيدين\",\"Image\":\"logo.png\",\"Description\":\"علاج قرحة الأثني عشر علاج القرحة المعدية الارتجاع المريئي\",\"P_Price\":\"0\",\"unit\":\"باكت\"},{\"ID_Products\":\"11033\",\"P_Name\":\"اكتازون 30مجم 30 ق اقراص\",\"ID_Scientific\":\"799\",\"creator_name\":\"اسيا\",\"stored_name\":\"شركة الفرقان التجارية\",\"Scientific_Name\":\"بيوغليتازون\",\"Image\":\"logo.png\",\"Description\":\"علاج السكري من النوع الثاني\",\"P_Price\":\"4410\",\"unit\":\"باكت\"},{\"ID_Products\":\"8917\",\"P_Name\":\"Loratan 10mg Tablets\",\"ID_Scientific\":\"231\",\"creator_name\":\"دار الدواء\",\"stored_name\":\"السقاف للأدوية\",\"Scientific_Name\":\"لوراتادين\",\"Image\":\"logo.png\",\"Description\":\"مضاد للهيستامين علاج الأعراض التي تصاحب التهاب الانف التحسسي كالعطاس والحطة الانفية والسيلان من الانف كما يعالج حالات حساسية وحرقان واحمرار وحكة العين ويستخدم ايضاً كعلاج مساعد للتحكم في أعراض حالات البرد\",\"P_Price\":\"0\",\"unit\":\"باكت\"},{\"ID_Products\":\"9264\",\"P_Name\":\"فلوسيتبرام اي اس اقراص\",\"ID_Scientific\":\"1419\",\"creator_name\":\"ماسكوت\",\"stored_name\":\"هيلان فارما يمن لتجارة الأدوية والمستلزمات الطبية\",\"Scientific_Name\":\"Flupentixol + Escitalopram\",\"Image\":\"logo.png\",\"Description\":\" \",\"P_Price\":\"2400\",\"unit\":\"باكت\"},{\"ID_Products\":\"12476\",\"P_Name\":\"lnsulin Actrapid Mc 40 l.U Vial\",\"ID_Scientific\":\"2057\",\"creator_name\":\"Novo Nordisk\",\"stored_name\":\"مؤسسة الرأفة للأدوية\",\"Scientific_Name\":\"Human lnsulin\",\"Image\":\"logo.png\",\"Description\":\"لعلاج سكر الدم\",\"P_Price\":\"0\",\"unit\":\"باكت\"},{\"ID_Products\":\"11289\",\"P_Name\":\"Bioxime 500mg Tablets\",\"ID_Scientific\":\"274\",\"creator_name\":\"Pharmacare Interantional\",\"stored_name\":\"فارما كير الشركة الدولية لصناعة الأدوية\",\"Scientific_Name\":\"سيفوروكسيم\",\"Image\":\"logo.png\",\"Description\":\"مضاد حيوي\",\"P_Price\":\"0\",\"unit\":\"باكت\"},{\"ID_Products\":\"10851\",\"P_Name\":\"Nervcare Capsules\",\"ID_Scientific\":\"2\",\"creator_name\":\"سيبلا ميديكا للأدوية\",\"stored_name\":\" سيبلا ميديكا للأدوية\",\"Scientific_Name\":\"غير محدد\",\"Image\":\"logo.png\",\"Description\":\"\",\"P_Price\":\"0\",\"unit\":\"باكت\"},{\"ID_Products\":\"10646\",\"P_Name\":\"ازاكس 500مجم اقراص\",\"ID_Scientific\":\"180\",\"creator_name\":\"نوبل\",\"stored_name\":\"شركة النهدي الطبية الدولية المحدودة\",\"Scientific_Name\":\"ازيثروميسين\",\"Image\":\"logo.png\",\"Description\":\"مضاد حيوي\",\"P_Price\":\"1800\",\"unit\":\"باكت\"}]";
    String responsemodel = "{\"ID_Products\":\"9397\",\"P_Name\":\"ديكلوبان 25 مجم تحاميل\",\"ID_Scientific\":\"229\",\"creator_name\":\"الشركة العالمية لصناعة الأدوية\",\"stored_name\":\"الشركة العالمية لصناعة الأدوية\",\"Scientific_Name\":\"ديكلوفيناك الصوديوم\",\"Image\":\"logo.png\",\"Description\":\"مضاد للالتهاب مسكن للالم خافض للحرارة \",\"P_Price\":\"340\",\"unit\":\"باكت\"}";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<Slider> theslider = new shared().JSONTOARRAY(response);
        Slider ddd = new shared().JSONTOMODEL(Slider.class, responsemodel);
        Toast.makeText(App.getContext(), String.valueOf(theslider.size()), Toast.LENGTH_SHORT).show();
        Toast.makeText(App.getContext(), "themodel" + ddd.getP_Name(), Toast.LENGTH_SHORT).show();
    }
}
