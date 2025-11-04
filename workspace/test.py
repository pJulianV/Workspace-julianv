def minion_game(string):
    s = string.upper().strip()
    vowels = 'AEIOU'
    kevin = 0
    stuart = 0
    n = len(s)

    print(f"String: {s}")
    print(f"Total length: {n}\n")

    for i, ch in enumerate(s):
        points = n - i
        if ch in vowels:
            kevin += points
            print(f"{i:3}: '{ch}' → Kevin +{points} (total {kevin})")
        else:
            stuart += points
            print(f"{i:3}: '{ch}' → Stuart +{points} (total {stuart})")

    print("\nFinal scores:")
    print(f"Kevin = {kevin}")
    print(f"Stuart = {stuart}")

    if kevin > stuart:
        print(f"Winner: Kevin {kevin}")
    elif stuart > kevin:
        print(f"Winner: Stuart {stuart}")
    else:
        print("Draw")


if __name__ == '__main__':

    minion_game("BANANANAAAS")