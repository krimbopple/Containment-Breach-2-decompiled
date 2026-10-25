Function createachievementmsg.achievementmsg(arg0$)
    Local local0.achievementmsg
    Local local1%
    Local local2%
    Local local3%
    Local local4%
    local0 = (New achievementmsg)
    local1 = _JsonGetValue(localachievementsarray, "translations")
    local2 = _JsonGetValue(achievementsarray, "translations")
    local3 = _JsonGetValue(_JsonGetValue(local1, arg0), "name")
    If (_JsonIsNull(local3) <> 0) Then
        local3 = _JsonGetValue(_JsonGetValue(local2, arg0), "name")
    EndIf
    local0\Field3 = _JsonGetString(local3)
    local4 = _JsonGetValue(_JsonGetValue(local1, arg0), "description")
    If (_JsonIsNull(local4) <> 0) Then
        local4 = _JsonGetValue(_JsonGetValue(local2, arg0), "description")
    EndIf
    local0\Field0 = _JsonGetString(local4)
    local0\Field2 = 0.0
    local0\Field1 = fps\Field3[$01]
    local0\Field5 = currachvmsgid
    local0\Field4 = _S2IMapGet(achievementsimages, arg0)
    currachvmsgid = (currachvmsgid + $01)
    Return local0
    Return Null
End Function
