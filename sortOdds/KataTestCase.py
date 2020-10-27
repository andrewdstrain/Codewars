import unittest
import Kata


class KataTestCase(unittest.TestCase):
    def test_example1(self):
        self.assertEqual([1, 3, 2, 8, 5, 4], Kata.sort_array([5, 3, 2, 8, 1, 4]))

    def test_example2(self):
        self.assertEqual([1, 3, 5, 8, 0], Kata.sort_array([5, 3, 1, 8, 0]))

    def test_example3(self):
        self.assertEqual([], Kata.sort_array([]))


if __name__ == '__main__':
    unittest.main()
