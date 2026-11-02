// ===== CHALLENGE 2 =====
public boolean change(String newPw, String duplicate)
{
    if (newPw.equals(duplicate) && !newPw.equals(secret))
    {
        secret = newPw;
        return true;
    }
    else
    {
        return false;
    }
}

// ===== CHALLENGE 3 =====
public boolean isSafe(String username)
{
    if (secret.equals("password"))
    {
        return false;
    }
    else if (secret.indexOf(username) != -1)
    {
        return false;
    }
    else
    {
        return true;
    }
}