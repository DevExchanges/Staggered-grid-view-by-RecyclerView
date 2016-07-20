package info.devexchanges.staggeredrecyclerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    private StaggeredGridLayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);

        layoutManager = new StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);

        List<Book> bookList = getListItemData();

        BookRecyclerViewAdapter adapter = new BookRecyclerViewAdapter(MainActivity.this, bookList);
        recyclerView.setAdapter(adapter);
    }

    private List<Book> getListItemData(){

        List<Book> listViewItems = new ArrayList<>();
        listViewItems.add(new Book("1984", "George Orwell"));
        listViewItems.add(new Book("Lão Hạc", "Nam Cao"));
        listViewItems.add(new Book("Kafka on the shore", "Haruki Murakami"));
        listViewItems.add(new Book("Pride and Prejudice", "Jane Austen"));
        listViewItems.add(new Book("Mảnh trăng cuối rừng", "Nguyễn Minh Châu"));
        listViewItems.add(new Book("One Hundred Years of Solitude", "Gabriel Garcia Marquez"));
        listViewItems.add(new Book("The Book Thief", "Markus Zusak"));
        listViewItems.add(new Book("The Hunger Games", "Suzanne Collins"));
        listViewItems.add(new Book("Số đỏ", "Vũ Trọng Phụng"));
        listViewItems.add(new Book("The Hitchhiker's Guide to the Galaxy", "Douglas Adams"));
        listViewItems.add(new Book("The Theory Of Everything", "Dr Stephen Hawking"));
        listViewItems.add(new Book("Đàn ghi-ta của Lorca", "Thanh Thảo"));
        listViewItems.add(new Book("The Trial", "Franz Kafka"));

        return listViewItems;
    }
}
