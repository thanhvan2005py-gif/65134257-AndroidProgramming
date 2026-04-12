package van.viewpager;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class ViewPagerAdapter extends FragmentStateAdapter {

    // Constructor
    public ViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    // Trả về Fragment theo vị trí
    @NonNull
    @Override
    public Fragment createFragment(int position) {

        if (position == 0) {
            return new HomeFragment();
        } else if (position == 1) {
            return new OneFragment();
        } else {
            return new TwoFragment();
        }
    }
    // Số lượng trang
    @Override
    public int getItemCount() {
        return 3;
    }
}
