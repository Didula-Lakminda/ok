package com.example.profilehandle.ViewHolder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.profilehandle.Interface.ItemClickListner;
import com.example.profilehandle.R;

public class ProductViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener
{
    public TextView categoryName, categoryDes;
    public ImageView CategoryImage;
    public ItemClickListner listner;

    public ProductViewHolder(@NonNull View itemView)
    {
        super(itemView);

        CategoryImage = (ImageView) itemView.findViewById(R.id.CategoryImage);
        categoryName = (TextView) itemView.findViewById(R.id.categoryName);
        categoryDes = (TextView) itemView.findViewById(R.id.categoryDes);

    }

    public void setItemClickListner(ItemClickListner listner)
    {
        this.listner = listner;
    }

    @Override
    public void onClick(View view) {
        listner.onClick(view, getAdapterPosition(), false);
    }
}
