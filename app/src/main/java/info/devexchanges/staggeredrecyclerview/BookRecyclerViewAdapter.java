package info.devexchanges.staggeredrecyclerview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class BookRecyclerViewAdapter extends RecyclerView.Adapter<BookRecyclerViewAdapter.BookViewHolder> {

    private List<Book> itemList;
    private Context context;

    public BookRecyclerViewAdapter(Context context, List<Book> itemList) {
        this.itemList = itemList;
        this.context = context;
    }

    @Override
    public BookViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_grid, null);
        BookViewHolder rcv = new BookViewHolder(layoutView);
        return rcv;
    }

    @Override
    public void onBindViewHolder(BookViewHolder holder, int position) {
        holder.bookName.setText(itemList.get(position).getName());
        holder.author.setText(itemList.get(position).getAuthor());
    }

    @Override
    public int getItemCount() {
        return this.itemList.size();
    }

    public class BookViewHolder extends RecyclerView.ViewHolder {

        public TextView bookName;
        public TextView author;

        public BookViewHolder(View itemView) {
            super(itemView);

            bookName = (TextView) itemView.findViewById(R.id.book_name);
            author = (TextView) itemView.findViewById(R.id.author);
        }
    }
}
