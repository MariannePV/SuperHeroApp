package campalans.m8.superheroapp

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import campalans.m8.superheroapp.databinding.ItemSuperheroBinding
import com.squareup.picasso.Picasso

class SuperHeroViewHolder (view: View): RecyclerView.ViewHolder(view) {

    private val binding = ItemSuperheroBinding.bind(view)

    fun bind(superHeroItemResponse: SuperHeroItemResponse, onItemSelected:(String) -> Unit)
    {
        binding.tvSuperHeroName.text = superHeroItemResponse.name

        Picasso.get().load(superHeroItemResponse.superHeroImage.url).into(binding.imageSuperHero)

        binding.root.setOnClickListener { onItemSelected(superHeroItemResponse.superHeroId) }
    }
}