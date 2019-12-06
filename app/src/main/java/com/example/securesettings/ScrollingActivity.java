package com.example.securesettings;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.provider.Settings;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class ScrollingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling);
        TextView mMessageWindow = (TextView) findViewById(R.id.messageWindow);


        final String my_settings = getSecureSettings(ScrollingActivity.this);

        mMessageWindow.setText(my_settings);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();

                Intent shareIntent = new Intent();
                shareIntent.setAction(Intent.ACTION_SEND);
                shareIntent.putExtra(Intent.EXTRA_TEXT, my_settings);
                shareIntent.setType("text/plain");
                startActivity(Intent.createChooser(shareIntent, "Share using:"));

            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_scrolling, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public static String getSecureSettings(Context context) {

        StringBuilder sb = new StringBuilder();
        sb.append(
                 Settings.Secure.ACCESSIBILITY_DISPLAY_INVERSION_ENABLED.toUpperCase()).append("=").append(Settings.Secure.getString(context.getContentResolver(),Settings.Secure.ACCESSIBILITY_DISPLAY_INVERSION_ENABLED))
                .append("\n").append(Settings.Secure.ACCESSIBILITY_ENABLED.toUpperCase()).append("=").append(Settings.Secure.getString(context.getContentResolver(),Settings.Secure.ACCESSIBILITY_ENABLED))
                .append("\n").append(Settings.Secure.ACCESSIBILITY_SPEAK_PASSWORD.toUpperCase()).append("=").append(Settings.Secure.getString(context.getContentResolver(),Settings.Secure.ACCESSIBILITY_SPEAK_PASSWORD))
                .append("\n").append(Settings.Secure.ADB_ENABLED.toUpperCase()).append("=").append(Settings.Secure.getString(context.getContentResolver(),Settings.Secure.ADB_ENABLED))
                .append("\n").append(Settings.Secure.ALLOWED_GEOLOCATION_ORIGINS.toUpperCase()).append("=").append(Settings.Secure.getString(context.getContentResolver(),Settings.Secure.ALLOWED_GEOLOCATION_ORIGINS))
                .append("\n").append(Settings.Secure.ALLOW_MOCK_LOCATION.toUpperCase()).append("=").append(Settings.Secure.getString(context.getContentResolver(),Settings.Secure.ALLOW_MOCK_LOCATION))
                .append("\n").append(Settings.Secure.ANDROID_ID.toUpperCase()).append("=").append(Settings.Secure.getString(context.getContentResolver(),Settings.Secure.ANDROID_ID))
                .append("\n").append(Settings.Secure.BACKGROUND_DATA.toUpperCase()).append("=").append(Settings.Secure.getString(context.getContentResolver(),Settings.Secure.BACKGROUND_DATA))
                .append("\n").append(Settings.Secure.BLUETOOTH_ON.toUpperCase()).append("=").append(Settings.Secure.getString(context.getContentResolver(),Settings.Secure.BLUETOOTH_ON))
                .append("\n").append(Settings.Secure.DATA_ROAMING.toUpperCase()).append("=").append(Settings.Secure.getString(context.getContentResolver(),Settings.Secure.DATA_ROAMING))
                .append("\n").append(Settings.Secure.DEFAULT_INPUT_METHOD.toUpperCase()).append("=").append(Settings.Secure.getString(context.getContentResolver(),Settings.Secure.DEFAULT_INPUT_METHOD))
                .append("\n").append(Settings.Secure.DEVICE_PROVISIONED.toUpperCase()).append("=").append(Settings.Secure.getString(context.getContentResolver(),Settings.Secure.DEVICE_PROVISIONED))
                .append("\n").append(Settings.Secure.ENABLED_ACCESSIBILITY_SERVICES.toUpperCase()).append("=").append(Settings.Secure.getString(context.getContentResolver(),Settings.Secure.ENABLED_ACCESSIBILITY_SERVICES))
                .append("\n").append(Settings.Secure.ENABLED_INPUT_METHODS.toUpperCase()).append("=").append(Settings.Secure.getString(context.getContentResolver(),Settings.Secure.ENABLED_INPUT_METHODS))
                .append("\n").append(Settings.Secure.HTTP_PROXY.toUpperCase()).append("=").append(Settings.Secure.getString(context.getContentResolver(),Settings.Secure.HTTP_PROXY))
                .append("\n").append(Settings.Secure.INPUT_METHOD_SELECTOR_VISIBILITY.toUpperCase()).append("=").append(Settings.Secure.getString(context.getContentResolver(),Settings.Secure.INPUT_METHOD_SELECTOR_VISIBILITY))
                .append("\n").append(Settings.Secure.INSTALL_NON_MARKET_APPS.toUpperCase()).append("=").append(Settings.Secure.getString(context.getContentResolver(),Settings.Secure.INSTALL_NON_MARKET_APPS))
                .append("\n").append(Settings.Secure.LOCATION_MODE.toUpperCase()).append("=").append(Settings.Secure.getString(context.getContentResolver(),Settings.Secure.LOCATION_MODE))
                .append("\n").append("LOCATION_MODE_BATTERY_SAVING").append("=").append(Settings.Secure.getString(context.getContentResolver(), String.valueOf(Settings.Secure.LOCATION_MODE_BATTERY_SAVING)))
                .append("\n").append("LOCATION_MODE_HIGH_ACCURACY").append("=").append(Settings.Secure.getString(context.getContentResolver(), String.valueOf(Settings.Secure.LOCATION_MODE_HIGH_ACCURACY)))
                .append("\n").append("LOCATION_MODE_OFF").append("=").append(Settings.Secure.getString(context.getContentResolver(), String.valueOf(Settings.Secure.LOCATION_MODE_OFF)))
                .append("\n").append("LOCATION_MODE_SENSORS_ONLY").append("=").append(Settings.Secure.getString(context.getContentResolver(), String.valueOf(Settings.Secure.LOCATION_MODE_SENSORS_ONLY)))
                .append("\n").append(Settings.Secure.LOCATION_PROVIDERS_ALLOWED.toUpperCase()).append("=").append(Settings.Secure.getString(context.getContentResolver(),Settings.Secure.LOCATION_PROVIDERS_ALLOWED))
                .append("\n").append(Settings.Secure.LOCK_PATTERN_ENABLED.toUpperCase()).append("=").append(Settings.Secure.getString(context.getContentResolver(),Settings.Secure.LOCK_PATTERN_ENABLED))
                .append("\n").append(Settings.Secure.LOCK_PATTERN_TACTILE_FEEDBACK_ENABLED.toUpperCase()).append("=").append(Settings.Secure.getString(context.getContentResolver(),Settings.Secure.LOCK_PATTERN_TACTILE_FEEDBACK_ENABLED))
                .append("\n").append(Settings.Secure.LOCK_PATTERN_VISIBLE.toUpperCase()).append("=").append(Settings.Secure.getString(context.getContentResolver(),Settings.Secure.LOCK_PATTERN_VISIBLE))
                .append("\n").append(Settings.Secure.LOGGING_ID.toUpperCase()).append("=").append(Settings.Secure.getString(context.getContentResolver(),Settings.Secure.LOGGING_ID))
                .append("\n").append(Settings.Secure.NETWORK_PREFERENCE.toUpperCase()).append("=").append(Settings.Secure.getString(context.getContentResolver(),Settings.Secure.NETWORK_PREFERENCE))
                .append("\n").append(Settings.Secure.PARENTAL_CONTROL_ENABLED.toUpperCase()).append("=").append(Settings.Secure.getString(context.getContentResolver(),Settings.Secure.PARENTAL_CONTROL_ENABLED))
                .append("\n").append(Settings.Secure.PARENTAL_CONTROL_LAST_UPDATE.toUpperCase()).append("=").append(Settings.Secure.getString(context.getContentResolver(),Settings.Secure.PARENTAL_CONTROL_LAST_UPDATE))
                .append("\n").append(Settings.Secure.PARENTAL_CONTROL_REDIRECT_URL.toUpperCase()).append("=").append(Settings.Secure.getString(context.getContentResolver(),Settings.Secure.PARENTAL_CONTROL_REDIRECT_URL))
                .append("\n").append(Settings.Secure.RTT_CALLING_MODE.toUpperCase()).append("=").append(Settings.Secure.getString(context.getContentResolver(),Settings.Secure.RTT_CALLING_MODE))
                .append("\n").append(Settings.Secure.SELECTED_INPUT_METHOD_SUBTYPE.toUpperCase()).append("=").append(Settings.Secure.getString(context.getContentResolver(),Settings.Secure.SELECTED_INPUT_METHOD_SUBTYPE))
                .append("\n").append(Settings.Secure.SETTINGS_CLASSNAME.toUpperCase()).append("=").append(Settings.Secure.getString(context.getContentResolver(),Settings.Secure.SETTINGS_CLASSNAME))
                .append("\n").append(Settings.Secure.SKIP_FIRST_USE_HINTS.toUpperCase()).append("=").append(Settings.Secure.getString(context.getContentResolver(),Settings.Secure.SKIP_FIRST_USE_HINTS))
                .append("\n").append(Settings.Secure.TOUCH_EXPLORATION_ENABLED.toUpperCase()).append("=").append(Settings.Secure.getString(context.getContentResolver(),Settings.Secure.TOUCH_EXPLORATION_ENABLED))
                .append("\n").append(Settings.Secure.TTS_DEFAULT_COUNTRY.toUpperCase()).append("=").append(Settings.Secure.getString(context.getContentResolver(),Settings.Secure.TTS_DEFAULT_COUNTRY))
                .append("\n").append(Settings.Secure.TTS_DEFAULT_LANG.toUpperCase()).append("=").append(Settings.Secure.getString(context.getContentResolver(),Settings.Secure.TTS_DEFAULT_LANG))
                .append("\n").append(Settings.Secure.TTS_DEFAULT_PITCH.toUpperCase()).append("=").append(Settings.Secure.getString(context.getContentResolver(),Settings.Secure.TTS_DEFAULT_PITCH))
                .append("\n").append(Settings.Secure.TTS_DEFAULT_RATE.toUpperCase()).append("=").append(Settings.Secure.getString(context.getContentResolver(),Settings.Secure.TTS_DEFAULT_RATE))
                .append("\n").append(Settings.Secure.TTS_DEFAULT_SYNTH.toUpperCase()).append("=").append(Settings.Secure.getString(context.getContentResolver(),Settings.Secure.TTS_DEFAULT_SYNTH))
                .append("\n").append(Settings.Secure.TTS_DEFAULT_VARIANT.toUpperCase()).append("=").append(Settings.Secure.getString(context.getContentResolver(),Settings.Secure.TTS_DEFAULT_VARIANT))
                .append("\n").append(Settings.Secure.TTS_ENABLED_PLUGINS.toUpperCase()).append("=").append(Settings.Secure.getString(context.getContentResolver(),Settings.Secure.TTS_ENABLED_PLUGINS))
                .append("\n").append(Settings.Secure.TTS_USE_DEFAULTS.toUpperCase()).append("=").append(Settings.Secure.getString(context.getContentResolver(),Settings.Secure.TTS_USE_DEFAULTS))
                .append("\n").append(Settings.Secure.USB_MASS_STORAGE_ENABLED.toUpperCase()).append("=").append(Settings.Secure.getString(context.getContentResolver(),Settings.Secure.USB_MASS_STORAGE_ENABLED))
                .append("\n").append(Settings.Secure.USE_GOOGLE_MAIL.toUpperCase()).append("=").append(Settings.Secure.getString(context.getContentResolver(),Settings.Secure.USE_GOOGLE_MAIL))
                .append("\n").append(Settings.Secure.WIFI_MAX_DHCP_RETRY_COUNT.toUpperCase()).append("=").append(Settings.Secure.getString(context.getContentResolver(),Settings.Secure.WIFI_MAX_DHCP_RETRY_COUNT))
                .append("\n").append(Settings.Secure.WIFI_MOBILE_DATA_TRANSITION_WAKELOCK_TIMEOUT_MS.toUpperCase()).append("=").append(Settings.Secure.getString(context.getContentResolver(),Settings.Secure.WIFI_MOBILE_DATA_TRANSITION_WAKELOCK_TIMEOUT_MS))
                .append("\n").append(Settings.Secure.WIFI_NETWORKS_AVAILABLE_NOTIFICATION_ON.toUpperCase()).append("=").append(Settings.Secure.getString(context.getContentResolver(),Settings.Secure.WIFI_NETWORKS_AVAILABLE_NOTIFICATION_ON))
                .append("\n").append(Settings.Secure.WIFI_NETWORKS_AVAILABLE_REPEAT_DELAY.toUpperCase()).append("=").append(Settings.Secure.getString(context.getContentResolver(),Settings.Secure.WIFI_NETWORKS_AVAILABLE_REPEAT_DELAY))
                .append("\n").append(Settings.Secure.WIFI_NUM_OPEN_NETWORKS_KEPT.toUpperCase()).append("=").append(Settings.Secure.getString(context.getContentResolver(),Settings.Secure.WIFI_NUM_OPEN_NETWORKS_KEPT))
                .append("\n").append(Settings.Secure.WIFI_ON.toUpperCase()).append("=").append(Settings.Secure.getString(context.getContentResolver(),Settings.Secure.WIFI_ON))
                .append("\n").append(Settings.Secure.WIFI_WATCHDOG_ACCEPTABLE_PACKET_LOSS_PERCENTAGE.toUpperCase()).append("=").append(Settings.Secure.getString(context.getContentResolver(),Settings.Secure.WIFI_WATCHDOG_ACCEPTABLE_PACKET_LOSS_PERCENTAGE))
                .append("\n").append(Settings.Secure.WIFI_WATCHDOG_AP_COUNT.toUpperCase()).append("=").append(Settings.Secure.getString(context.getContentResolver(),Settings.Secure.WIFI_WATCHDOG_AP_COUNT))
                .append("\n").append(Settings.Secure.WIFI_WATCHDOG_BACKGROUND_CHECK_DELAY_MS.toUpperCase()).append("=").append(Settings.Secure.getString(context.getContentResolver(),Settings.Secure.WIFI_WATCHDOG_BACKGROUND_CHECK_DELAY_MS))
                .append("\n").append(Settings.Secure.WIFI_WATCHDOG_BACKGROUND_CHECK_ENABLED.toUpperCase()).append("=").append(Settings.Secure.getString(context.getContentResolver(),Settings.Secure.WIFI_WATCHDOG_BACKGROUND_CHECK_ENABLED))
                .append("\n").append(Settings.Secure.WIFI_WATCHDOG_BACKGROUND_CHECK_TIMEOUT_MS.toUpperCase()).append("=").append(Settings.Secure.getString(context.getContentResolver(),Settings.Secure.WIFI_WATCHDOG_BACKGROUND_CHECK_TIMEOUT_MS))
                .append("\n").append(Settings.Secure.WIFI_WATCHDOG_INITIAL_IGNORED_PING_COUNT.toUpperCase()).append("=").append(Settings.Secure.getString(context.getContentResolver(),Settings.Secure.WIFI_WATCHDOG_INITIAL_IGNORED_PING_COUNT))
                .append("\n").append(Settings.Secure.WIFI_WATCHDOG_MAX_AP_CHECKS.toUpperCase()).append("=").append(Settings.Secure.getString(context.getContentResolver(),Settings.Secure.WIFI_WATCHDOG_MAX_AP_CHECKS))
                .append("\n").append(Settings.Secure.WIFI_WATCHDOG_ON.toUpperCase()).append("=").append(Settings.Secure.getString(context.getContentResolver(),Settings.Secure.WIFI_WATCHDOG_ON))
                .append("\n").append(Settings.Secure.WIFI_WATCHDOG_PING_COUNT.toUpperCase()).append("=").append(Settings.Secure.getString(context.getContentResolver(),Settings.Secure.WIFI_WATCHDOG_PING_COUNT))
                .append("\n").append(Settings.Secure.WIFI_WATCHDOG_PING_DELAY_MS.toUpperCase()).append("=").append(Settings.Secure.getString(context.getContentResolver(),Settings.Secure.WIFI_WATCHDOG_PING_DELAY_MS))
                .append("\n").append(Settings.Secure.WIFI_WATCHDOG_PING_TIMEOUT_MS.toUpperCase()).append("=").append(Settings.Secure.getString(context.getContentResolver(),Settings.Secure.WIFI_WATCHDOG_PING_TIMEOUT_MS))
                .append("\n").append(Settings.Secure.WIFI_WATCHDOG_WATCH_LIST.toUpperCase()).append("=").append(Settings.Secure.getString(context.getContentResolver(),Settings.Secure.WIFI_WATCHDOG_WATCH_LIST));

        return sb.toString();
    }
}

