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

public class NewsFragment1 extends Fragment {

    public NewsFragment1() {
        // Required empty public constructor
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_news1, container, false);

        // Find the TextViews for the links
        TextView link1TextView = view.findViewById(R.id.link1TextView);
        TextView link2TextView = view.findViewById(R.id.link2TextView);
        TextView link3TextView = view.findViewById(R.id.link3TextView);
        TextView link4TextView = view.findViewById(R.id.link4TextView);

        // Set click listeners for each link
        link1TextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLink("https://www.forbes.com/sites/forbesbusinesscouncil/2023/06/23/embracing-sustainability-the-rise-of-eco-friendly-packaging-solutions/?sh=76c3461c271d\n");
            }
        });

        link2TextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLink("https://www.bisnow.com/washington-dc/news/sustainability-climate/public-transportation-sustainability-award-arlington-transportation-partners-studiob-122660\n");
            }
        });

        link3TextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLink("https://financialpost.com/pmn/business-pmn/cheap-coal-hampers-green-shift-in-emerging-world-says-macquarie\n");
            }
        });

        link4TextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLink("https://bnnbreaking.com/breaking-news/energy/green-for-growth-how-uks-energy-efficient-home-upgrades-fuel-property-value-and-sustainability");
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
