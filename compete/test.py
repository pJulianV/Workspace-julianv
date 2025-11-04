import random

def sample_lines_from_file(filename, k):
    reservoir = []
    with open(filename, 'r') as file:
        for i, line in enumerate(file):
            if i < k:
                reservoir.append(line.rstrip('\n'))
            else:
                j = random.randint(0, i)
                if j < k:
                    reservoir[j] = line.rstrip('\n')
    return reservoir
