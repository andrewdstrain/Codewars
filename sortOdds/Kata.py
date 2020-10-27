# Best answer
# -----------
# def sort_array(arr):
#   odds = sorted((x for x in arr if x%2 != 0), reverse=True)
#   return [x if x%2==0 else odds.pop() for x in arr]

def next_odd(array, index, length):
    while array[index] % 2 == 0:
        index += 1
        if not index < length:
            return None, length

    return array[index], index + 1


def sort_array(source_array):
    index = 0
    odd_index = 0
    length = len(source_array)
    odds = source_array[::]
    odds.sort()

    while index < length:
        if source_array[index] % 2 == 1:
            value, odd_index = next_odd(odds, odd_index, length)
            source_array[index] = value

        index += 1

    return source_array
