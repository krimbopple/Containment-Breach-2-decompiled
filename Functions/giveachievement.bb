Function giveachievement%(arg0$, arg1%)
    If (TX6ZD06226X(unlockedachievements, arg0) <> 0) Then
        Return $00
    EndIf
    XBFB82424B(arg0)
    YFZ8BD2F6(unlockedachievements, arg0, $1)
    If ((opt\Field51 And arg1) <> 0) Then
        createachievementmsg(arg0)
    EndIf
    Return $00
End Function
