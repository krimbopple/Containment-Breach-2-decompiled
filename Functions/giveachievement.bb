Function giveachievement%(arg0$, arg1%)
    If (_S2IMapContains(unlockedachievements, arg0) <> 0) Then
        Return $00
    EndIf
    GUESSEDachievementgiveachievement(arg0)
    _S2IMapSet(unlockedachievements, arg0, $1)
    If ((opt\Field51 And arg1) <> 0) Then
        createachievementmsg(arg0)
    EndIf
    Return $00
End Function
