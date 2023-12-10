package com.suresh.interiordesigning

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Icon
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.suresh.interiordesigning.components.ButtonComponent
import com.suresh.interiordesigning.components.CheckboxComponent
import com.suresh.interiordesigning.components.ClickableLoginTextComponent
import com.suresh.interiordesigning.components.DividerTextComponent
import com.suresh.interiordesigning.components.HeadingTextComponent
import com.suresh.interiordesigning.components.MyTextFieldComponent
import com.suresh.interiordesigning.components.PasswordTextFieldComponent
import com.suresh.interiordesigning.data.signup.SignupUIEvent
import com.suresh.interiordesigning.data.signup.SignupViewModel
import com.suresh.interiordesigning.navigation.InteriorAppRouter
import com.suresh.interiordesigning.navigation.Screen


@Composable
fun SignUpScreen(signupViewModel: SignupViewModel = viewModel()) {

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Surface(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.White)
                .padding(28.dp)) {

            Column(modifier = Modifier.fillMaxSize()) {

                Image(painter = painterResource(id = R.drawable.interior),contentDescription = null)


                Spacer(modifier = Modifier.height(30.dp))


                MyTextFieldComponent(
                    labelValue = stringResource(id = R.string.first_name),
                    painterResource(id = R.drawable.profile),
                    onTextChanged = {
                        signupViewModel.onEvent(SignupUIEvent.FirstNameChanged(it))
                    },
                    errorStatus = signupViewModel.registrationUIState.value.firstNameError
                )

//                MyTextFieldComponent(
//                    labelValue = stringResource(id = R.string.last_name),
//                    painterResource = painterResource(id = R.drawable.profile),
//                    onTextChanged = {
//                        signupViewModel.onEvent(SignupUIEvent.LastNameChanged(it))
//                    },
//                    errorStatus = signupViewModel.registrationUIState.value.lastNameError
//                )

                MyTextFieldComponent(
                    labelValue = stringResource(id = R.string.email),
                    painterResource = painterResource(id = R.drawable.message),
                    onTextChanged = {
                        signupViewModel.onEvent(SignupUIEvent.EmailChanged(it))
                    },
                    errorStatus = signupViewModel.registrationUIState.value.emailError
                )

                PasswordTextFieldComponent(
                    labelValue = stringResource(id = R.string.password),
                    painterResource = painterResource(id = R.drawable.ic_lock),
                    onTextSelected = {
                        signupViewModel.onEvent(SignupUIEvent.PasswordChanged(it))
                    },
                    errorStatus = signupViewModel.registrationUIState.value.passwordError
                )

                CheckboxComponent(value = stringResource(id = R.string.terms_and_conditions),
                    onTextSelected = {
                        InteriorAppRouter.navigateTo(Screen.TermsAndConditionsScreen)
                    },
                    onCheckedChange = {
                        signupViewModel.onEvent(SignupUIEvent.PrivacyPolicyCheckBoxClicked(it))
                    }
                )

                Spacer(modifier = Modifier.height(40.dp))

                ButtonComponent(
                    value = stringResource(id = R.string.register),
                    onButtonClicked = {
                        signupViewModel.onEvent(SignupUIEvent.RegisterButtonClicked)
                    },
                    isEnabled = signupViewModel.allValidationsPassed.value
                )

                Spacer(modifier = Modifier.height(20.dp))

                DividerTextComponent()

                ClickableLoginTextComponent(tryingToLogin = true, onTextSelected = {
                    InteriorAppRouter.navigateTo(Screen.LoginScreen)
                })
            }
        }

        if(signupViewModel.signUpInProgress.value) {
            CircularProgressIndicator()
        }
    }
}

@Preview
@Composable
fun DefaultPreviewOfSignUpScreen() {
    SignUpScreen()
}