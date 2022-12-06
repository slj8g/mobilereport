package com.example.myap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    private EditText editTextid;
    private EditText editTextpswd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        setTitle("회원 로그인");
        editTextid = findViewById(R.id.editTextid);
        editTextpswd = findViewById(R.id.editTextpswd);

        findViewById(R.id.buttonlogin).setOnClickListener(v -> {
            doLogin();
        });
    }

    private void doLogin() {
        String loginId = editTextid.getText().toString().trim();
        String loginPassword = editTextpswd.getText().toString().trim();

        if (loginId.length() == 0) {
            Toast.makeText(this, "아이디를 입력하세요.", Toast.LENGTH_SHORT).show();
            editTextid.requestFocus();

            return;
        }
        if (loginPassword.length() == 0) {
            Toast.makeText(this, "비밀번호를 입력하세요.", Toast.LENGTH_SHORT).show();
            editTextpswd.requestFocus();

            return;
        }

        Member member = logindatabase.findMember(loginId);

        if (member == null) {
            Toast.makeText(this, "계정이 존재하지 않습니다", Toast.LENGTH_SHORT).show();
            editTextid.requestFocus();
            return;

        } else if (member.getLoginPassword().equals(loginPassword) == false) {
            Toast.makeText(this, "비밀번호가 틀렸습니다.", Toast.LENGTH_SHORT).show();
            editTextpswd.requestFocus();
            return;
        }
        Intent intent = new Intent(this,HomeActivity.class);
        intent.putExtra("loginedMemberId", member.getId());
        startActivity(intent);
        Toast.makeText(this, "로그인 완료", Toast.LENGTH_SHORT).show();
    }
}