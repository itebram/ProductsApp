package br.com.productsapp.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import br.com.productsapp.data.db.Databases
import com.squareup.moshi.Json

@Entity(tableName = Databases.Products.TABLE_NAME)
data class Products(
        @PrimaryKey(autoGenerate = true) val id: Int,
        @field:Json(name = "name") val name: String? = null,
        @field:Json(name = "imageURL") val imageURL: String? = null,
        @field:Json(name = "description") val description: String? = null,
)