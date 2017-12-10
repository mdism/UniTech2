package mdism.unitech;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class main_setting extends AppCompatActivity {

    EditText txtIP, txtPort, txtSalveId, txtReadRegister, txtWriteRegister;
    Button btnOK, btnCencel;
    private  ConnectInfo connectInfo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main_setting);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        ElementDefinations();

        this.btnOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(! (txtIP.getText().equals("") && txtPort.getText().equals("") && txtSalveId.getText().equals(""))){
                    connectInfo = new ConnectInfo();
                    connectInfo.setIpAdress(txtIP.getText().toString());
                }

            }
        });

    }

    private void ReadInformation(){

    }

    private void ElementDefinations(){
        this.txtIP = (EditText) this.findViewById(R.id.txtIP);
        this.txtPort =(EditText) this.findViewById(R.id.txtPort);
        this.txtSalveId =(EditText) this.findViewById(R.id.txtSlaveId);

        // txtButtonRegister == txtWriteRegister... at this location of remort device we will do write opretion.
        this.txtWriteRegister = (EditText) this.findViewById(R.id.txtButtonRegister);
        this.txtReadRegister = (EditText) this.findViewById(R.id.txtDisplayRegister);

        this.btnOK = (Button) this.findViewById(R.id.btnSettingOK);
        this.btnCencel = (Button) this.findViewById(R.id.btnSettingCencel);
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return super.onSupportNavigateUp();
    }
}
