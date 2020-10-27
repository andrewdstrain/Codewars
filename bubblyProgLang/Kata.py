stack = []


def _start(value):
    return stack.pop() if value is None else value


def _push(value: int):
    stack.append(value)
    return _start


def _add(value):
    num1: int = stack.pop()
    num2: int = stack.pop()
    stack.append(num1 + num2)
    return _start(value)


def _sub(value):
    num1: int = stack.pop()
    num2: int = stack.pop()
    stack.append(num1 - num2)
    return _start(value)


def _mul(value):
    num1: int = stack.pop()
    num2: int = stack.pop()
    stack.append(num1 * num2)
    return _start(value)


def _div(value):
    num1: int = stack.pop()
    num2: int = stack.pop()
    stack.append(num1 // num2)
    return _start(value)


start = _start
end = None
push = _push
add = _add
sub = _sub
mul = _mul
div = _div
