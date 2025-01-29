import random
import unittest
from prog985t import MergeSort
from time import perf_counter as current_time

def generate_large_list():
    return [random.randint(0, 10_000_000) for i in range(1_000_000)]

class TestMergeSort(unittest.TestCase):
    def setUp(self):
        self.startTime = current_time()

    def tearDown(self):
        t = current_time() - self.startTime
        print(f"{self.id()}: {t:6f}")

    def test_normal_case(self):
        input_arr = [4, 2, 5, 1, 3]
        expected_output = [1, 2, 3, 4, 5]
        MergeSort.sort(input_arr)
        self.assertEqual(input_arr, expected_output)

    def test_empty_case(self):
        input_arr = []
        expected_output = []
        MergeSort.sort(input_arr)
        self.assertEqual(input_arr, expected_output)

    def test_single_case(self):
        input_arr = [1]
        expected_output = [1]
        MergeSort.sort(input_arr)
        self.assertEqual(input_arr, expected_output)

    def test_identival_case(self):
        input_arr = [9, 9, 9, 9, 9]
        expected_output = [9, 9, 9, 9, 9]
        MergeSort.sort(input_arr)
        self.assertEqual(input_arr, expected_output)

    def test_negative_case(self):
        input_arr = [-4, -1, -7, -3]
        expected_output = [-7, -4, -3, -1]
        MergeSort.sort(input_arr)
        self.assertEqual(input_arr, expected_output)

    def test_mixed_case(self):
        input_arr = [6.2, 4, 0, 1.7]
        expected_output = [0, 1.7, 4, 6.2]
        MergeSort.sort(input_arr)
        self.assertEqual(input_arr, expected_output)


    # TODO: the rest of the test cases

    def test_performance_large_dataset(self):
        input_arr = generate_large_list()
        start_time = current_time()
        MergeSort.sort(input_arr)
        end_time = current_time()
        self.assertLess(end_time-start_time, 10)

if __name__ == '__main__':
    suite = unittest.TestLoader().loadTestsFromTestCase(TestMergeSort)
    unittest.TextTestRunner(verbosity=0).run(suite)