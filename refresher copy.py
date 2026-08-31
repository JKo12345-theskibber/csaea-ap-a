
# DATA: 
animals = ["cat", "dog", "blobfish", "shark", "owl", "toad"]

# Define a function that takes in the list above, and an animal 'name' as an argument.
# Loop through the list to check if it's there.
# Print "<animal> is in the list" or "<animal> is not in the list".
# Then call the function with the following tests: 

# PROCEDURE 1
def check_animal(name):
    for animal in animals: 
        if animal == name:
            print(f'{name} is in the list')
            return
    print(f"{name} is not in the list")

check_animal("cat")
check_animal("penguin")

# PROCEDURE 2

def num_animals():
    #Write code to check how many animals are in list. 
    # returns integer 

num_animals() 

# PROCEDURE 3

def first_animal():
    #print first animal

first_animal()