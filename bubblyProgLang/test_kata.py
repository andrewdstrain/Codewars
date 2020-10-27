import unittest

from Kata import start, end, push, add, sub, mul, div


class KataTestCase(unittest.TestCase):
    def test__start(self):
        self.assertEqual(42, (start)(push)(42)(end))

    def test__push(self):
        self.assertEqual(24, (start)(push)(24)(end))

    def test__add(self):
        self.assertEqual(8, (start)(push)(5)(push)(3)(add)(end))
        self.assertEqual(4, (start)(push)(1)(push)(1)(add)(push)(2)(add)(end))

    def test__sub(self):
        self.assertEqual(2, (start)(push)(3)(push)(5)(sub)(end))

    def test__mul(self):
        self.assertEqual(216, (start)(push)(8)(push)(9)(push)(3)(mul)(mul)(end))

    def test__div(self):
        self.assertEqual(48, (start)(push)(2)(push)(5)(div)(push)(3)(push)(8)(mul)(mul)(end))


if __name__ == '__main__':
    unittest.main()

