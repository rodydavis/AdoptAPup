package com.example.adoptapup.data

import com.example.adoptapup.R

class Dog(val name: String, val description: String, val image: Int)
class DogGroup(val name: String, val dogs: List<Dog>)

class DogProvider {
    val puppers = DogGroup(
        "PUPPERS", listOf(
            Dog(
                "Monty",
                "Monty enjoys chicken treats and cuddling while watching Seinfeld.",
                R.drawable.dog_1
            ),
            Dog(
                "Jubilee",
                "Jubilee enjoys thoughtful discussions by the campfire.",
                R.drawable.dog_2
            ),
            Dog(
                "Beezy",
                "Beezy's favorite past-time is helping you choose your brand color.",
                R.drawable.dog_3
            ),
            Dog(
                "Mochi",
                "Mochi is the perfect \"rubbery ducky\" debugging pup, always listening.",
                R.drawable.dog_4
            ),
            Dog(
                "Brewery",
                "Brewery loves fetching you your favorite homebrew.",
                R.drawable.dog_5
            ),
            Dog(
                "Lucy",
                "Picture yourself in a boat on a river, Lucy is a pup with kaleidoscope eyes.",
                R.drawable.dog_6
            ),
            Dog(
                "Astro",
                "Is it a bird? A plane? No, it's Astro blasting off into your heart!",
                R.drawable.dog_7
            ),
            Dog(
                "Boo",
                "Boo is just a teddy bear in disguise. What he lacks in grace, he makes up in charm.",
                R.drawable.dog_8
            ),
            Dog(
                "Pippa",
                "Pippa likes to look out the window and write pup-poetry",
                R.drawable.dog_9
            ),
            Dog(
                "Coco",
                "Coco enjoys getting pampered at the local puppy spa.\n",
                R.drawable.dog_10
            ),
            Dog(
                "Brody",
                "Brody is a good boy, waiting for your next command.",
                R.drawable.dog_11
            ),
            Dog(
                "Stella",
                "Stella! Calm and always up for a challenge, she's the perfect companion.",
                R.drawable.dog_12
            ),
        )
    )
    val doggos = DogGroup(
        "DOGGOS", listOf(

            Dog(
                "Brewery",
                "Brewery loves fetching you your favorite homebrew.",
                R.drawable.dog_4
            ),
            Dog(
                "Lucy",
                "Picture yourself in a boat on a river, Lucy is a pup with kaleidoscope eyes.",
                R.drawable.dog_6
            ),
            Dog(
                "Astro",
                "Is it a bird? A plane? No, it's Astro blasting off into your heart!",
                R.drawable.dog_7
            ),
            Dog(
                "Boo",
                "Boo is just a teddy bear in disguise. What he lacks in grace, he makes up in charm.",
                R.drawable.dog_8
            ),
        )
    )
    val woofers = DogGroup(
        "WOOFERS", listOf(
            Dog(
                "Pippa",
                "Pippa likes to look out the window and write pup-poetry",
                R.drawable.dog_9
            ),
            Dog(
                "Coco",
                "Coco enjoys getting pampered at the local puppy spa.\n",
                R.drawable.dog_10
            ),
            Dog(
                "Brody",
                "Brody is a good boy, waiting for your next command.",
                R.drawable.dog_11
            ),
            Dog(
                "Stella",
                "Stella! Calm and always up for a challenge, she's the perfect companion.",
                R.drawable.dog_12
            ),
        )
    )
    val allDogs = listOf(puppers, doggos, woofers)
    fun getGroup(index: Int): DogGroup = allDogs[index]
}