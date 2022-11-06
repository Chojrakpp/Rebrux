package be.ehb.rebruxdef.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import be.ehb.rebruxdef.R;

public class RegisterFragment extends Fragment implements View.OnClickListener {

    public RegisterFragment() {
        // Required empty public constructor
    }

    public static RegisterFragment newInstance() {
        RegisterFragment fragment = new RegisterFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View mView = inflater.inflate(R.layout.fragment_register, container, false);

        Button buttonRegisterLogin = mView.findViewById(R.id.btn_register_to_login);
        buttonRegisterLogin.setOnClickListener(this);
        Button buttonRegisterForgotpassword = mView.findViewById(R.id.btn_register_to_forgotpassword);
        buttonRegisterForgotpassword.setOnClickListener(this);

        return mView;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_register_to_login:
                Navigation.findNavController(v).navigate(R.id.action_register_to_login);
                break;
            case R.id.btn_register_to_forgotpassword:
                Navigation.findNavController(v).navigate(R.id.action_register_to_forgotpassword);
                break;
        }
    }
}