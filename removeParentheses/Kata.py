def remove_parentheses(s: str) -> str:
    # Use rfind to get nested parentheses
    index: int = s.rfind('(')

    # Loop until no more parenthesis
    while index > -1:
        # grab closing parenthesis
        end: int = s.find(')', index)

        # Remove parentheses
        s = s[:index] + s[end + 1:]

        # Use rfind to get nested parentheses
        index: int = s.rfind('(')

    return s
