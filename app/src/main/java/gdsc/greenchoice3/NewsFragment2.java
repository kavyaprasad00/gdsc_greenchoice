package gdsc.greenchoice3;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class NewsFragment2 extends Fragment {

    public NewsFragment2() {
        // Required empty public constructor
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_news2, container, false);

        // Find the TextViews for the links
        TextView link1TextView = view.findViewById(R.id.link1TextView);
        TextView link2TextView = view.findViewById(R.id.link2TextView);
        TextView link3TextView = view.findViewById(R.id.link3TextView);
        TextView link4TextView = view.findViewById(R.id.link4TextView);

        // Set click listeners for each link
        link1TextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLink("https://theconversation.com/extraction-of-raw-materials-could-rise-60-by-2060-and-making-mining-greener-wont-stop-the-damage-222818");
            }
        });

        link2TextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLink("https://www.imf.org/en/News/Articles/2022/12/12/cf-how-the-green-transition-will-impact-us-jobs");
            }
        });

        link3TextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLink("https://apnews.com/article/science-green-technology-climate-and-environment-renewable-energy-141761657a8e7a5627a0e49e601dd48e");
            }
        });

        link4TextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLink("https://www.euronews.com/green/2023/08/14/what-is-greenhushing-how-to-spot-the-sophisticated-greenwashing-tactics-being-used-in-2023");
            }
        });

        return view;
    }

    // Method to open a web link
    private void openLink(String url) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }
}
