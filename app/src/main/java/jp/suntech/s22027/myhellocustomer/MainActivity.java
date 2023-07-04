package jp.suntech.s22027.myhellocustomer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //ボタン・オブジェクトの用意
        Button btClick = findViewById(R.id.btClick);
        //リスナ・オブジェクトの用意
        HelloListener listener = new HelloListener();
        //ボタンにリスナを設定
        btClick.setOnClickListener(listener);

        //クリアボタンであるButtonオブジェクトを取得
        Button btAddressClear = findViewById(R.id.btNameClear);
        //クリアボタンにリスナを設定
        btAddressClear.setOnClickListener(listener);

        //クリアボタンであるButtonオブジェクトを取得
        Button btNameClear = findViewById(R.id.btAddressClear);
        //クリアボタンにリスナを設定
        btNameClear.setOnClickListener(listener);
    }

    //ボタンをクリックした時のリスナクラス
    private class HelloListener implements View.OnClickListener{

        @Override
        public void onClick(View view) {
            EditText inputName = findViewById(R.id.etName);
            EditText inputAddress = findViewById(R.id.etAddress);
            TextView output = findViewById(R.id.tvOutput);

            int id = view.getId();
            if(id==R.id.btClick){
                String inputNameStr = inputName.getText().toString();
                String inputAddressStr = inputAddress.getText().toString();
                output.setText(inputAddressStr + "にお住いの" + inputNameStr + "さん\nこんにちは！");
            }
            else if(id == R.id.btAddressClear){
                inputAddress.setText("");
                String inputNameStr = inputName.getText().toString();
                String inputAddressStr = inputAddress.getText().toString();
                output.setText(inputAddressStr + "にお住いの" + inputNameStr + "さん\nこんにちは！");
            }
            else if(id == R.id.btNameClear){
                inputName.setText("");
                String inputNameStr = inputName.getText().toString();
                String inputAddressStr = inputAddress.getText().toString();
                output.setText(inputAddressStr + "にお住いの" + inputNameStr + "さん\nこんにちは！");
            }

        }
    }

}