import unittest
from Kata import remove_parentheses


class KataTestCase(unittest.TestCase):
    def test_example1(self):
        self.assertEqual("exampleexample", remove_parentheses("example(unwanted thing)example"))

    def test_example2(self):
        self.assertEqual("example  example", remove_parentheses("example (unwanted thing) example"))

    def test_example3(self):
        self.assertEqual("a e", remove_parentheses("a (bc d)e"))

    def test_example4(self):
        self.assertEqual("a", remove_parentheses("a(b(c))"))

    def test_example5(self):
        self.assertEqual("hello example  something", remove_parentheses("hello example (words(more words) here) something"))

    def test_example6(self):
        self.assertEqual("  ", remove_parentheses("(first group) (second group) (third group)"))



if __name__ == '__main__':
    unittest.main()
