package com.example.pockedexinpocket.di

import com.example.pockedexinpocket.data.remote.PokeApi
import com.example.pockedexinpocket.repository.PokemonRepository
import com.example.pockedexinpocket.util.Constants.BASE_URL
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun providesPokemonRepository(api: PokeApi) = PokemonRepository(api)

    @Singleton
    @Provides
    fun providesPokeApi(): PokeApi {
        return Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(BASE_URL)
            .build()
            .create(PokeApi::class.java)
    }

}