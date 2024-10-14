from cl285b import Salesperson


def main():
    try:
        print("Number    Code    Sales    Commission")
        people = []
        with open("data/prog285b.txt", 'r') as file:
            for line in file:
                ldata = line.split(" ")
                id    = int(ldata[0])
                code  = int(ldata[1])
                sales = float(ldata[2])
                dude = Salesperson(id, code, sales)
                people.append(dude)
        for sp in people:  # for-each
            sp.calc()
            print(sp) # print(str(sp))
    except Exception as e:
        print("Error: ", e)

if __name__ == "__main__":
    main()

"""
Number    Code    Sales    Commission
101    17    $2250.00    $213.75
103    5    $4000.00    $300.00
117    3    $7350.00    $0.00
118    8    $7350.00    $574.75
125    5    $6500.00    $502.50
138    17    $6375.00    $677.50
192    8    $8125.00    $640.62
203    8    $3250.00    $243.75
218    5    $5000.00    $375.00
235    5    $5250.00    $396.25
264    17    $4150.00    $410.50
291    17    $750.00    $71.25
"""