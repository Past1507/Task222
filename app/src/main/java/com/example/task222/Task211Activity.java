package com.example.task222;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Toast;

public class Task211Activity extends AppCompatActivity {

    private EditText mInputMoney;
    private EditText mInputInfo;
    private Button mBtnOk;
    private CheckBox mBankCardChkBx;
    private CheckBox mMobilePhoneChkBx;
    private CheckBox mCashAddressChkBx;
    private int count;
    private String inputMoney;
    private String inputInfo;
    private String bankCardType;
    private String mobilePhoneType;
    private String cashAddressType;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task211);
        initViews();
    }

    private void resetCheckBoxes(){
        mBankCardChkBx.setChecked(false);
        mMobilePhoneChkBx.setChecked(false);
        mCashAddressChkBx.setChecked(false);
    }

    CompoundButton.OnCheckedChangeListener checkedChangeListener = new CompoundButton.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
            mBtnOk.setEnabled(b);
            if (b) {
                switch (compoundButton.getId()) {
                    case R.id.bankCardChkBx:
                        resetCheckBoxes();
                        mBankCardChkBx.setChecked(true);
                        mInputInfo.setInputType(InputType.TYPE_CLASS_NUMBER);
                        count =1;
                        break;
                    case R.id.mobilePhoneChkBx:
                        resetCheckBoxes();
                        mMobilePhoneChkBx.setChecked(true);
                        mInputInfo.setInputType(InputType.TYPE_CLASS_PHONE);
                        count =2;
                        break;
                    case R.id.cashAddressChkBx:
                        resetCheckBoxes();
                        mInputInfo.setInputType(InputType.TYPE_CLASS_TEXT);
                        mCashAddressChkBx.setChecked(true);
                        count =3;
                        break;
                    default:
                }
            }
        }
    };

    private void initViews() {
        mInputMoney = findViewById(R.id.inputMoney);
        mInputInfo = findViewById(R.id.inputInfo);
        mBtnOk = findViewById(R.id.btnOK);
        mBankCardChkBx = findViewById(R.id.bankCardChkBx);
        mMobilePhoneChkBx = findViewById(R.id.mobilePhoneChkBx);
        mCashAddressChkBx = findViewById(R.id.cashAddressChkBx);
        mBankCardChkBx.setOnCheckedChangeListener(checkedChangeListener);
        mMobilePhoneChkBx.setOnCheckedChangeListener(checkedChangeListener);
        mCashAddressChkBx.setOnCheckedChangeListener(checkedChangeListener);
    }

    @SuppressLint("StringFormatInvalid")
    public void clickOnBtnOk (View BtnOk) {
        inputMoney = mInputMoney.getText().toString();
        inputInfo = mInputInfo.getText().toString();
        bankCardType = getString(R.string.bankCardChkBxText).toLowerCase();
        mobilePhoneType = getString(R.string.mobilePhoneChkBxText).toLowerCase();
        cashAddressType = getString(R.string.cashAddressChkBxText).toLowerCase();
        switch (count) {
            case 1:
                Toast.makeText(Task211Activity.this, getString(R.string.resultText, inputMoney, bankCardType, inputInfo), Toast.LENGTH_LONG).show();
                break;
            case 2:
                Toast.makeText(Task211Activity.this, getString(R.string.resultText, inputMoney, mobilePhoneType, inputInfo), Toast.LENGTH_LONG).show();
                break;
            case 3:
                Toast.makeText(Task211Activity.this, getString(R.string.resultText, inputMoney, cashAddressType, inputInfo), Toast.LENGTH_LONG).show();
                break;
        }
    }
}
