Function createachievementmsg.achievementmsg(arg0$)
    Local local0.achievementmsg
    Local local1%
    Local local2%
    Local local3%
    Local local4%
    local0 = (New achievementmsg)
    local1 = TX0Z2Z4F86D(localachievementsarray, "translations")
    local2 = TX0Z2Z4F86D(achievementsarray, "translations")
    local3 = TX0Z2Z4F86D(TX0Z2Z4F86D(local1, arg0), "name")
    If (TF46ZF6DB6(local3) <> 0) Then
        local3 = TX0Z2Z4F86D(TX0Z2Z4F86D(local2, arg0), "name")
    EndIf
    local0\Field3 = TX240XXB6Z6(local3)
    local4 = TX0Z2Z4F86D(TX0Z2Z4F86D(local1, arg0), "description")
    If (TF46ZF6DB6(local4) <> 0) Then
        local4 = TX0Z2Z4F86D(TX0Z2Z4F86D(local2, arg0), "description")
    EndIf
    local0\Field0 = TX240XXB6Z6(local4)
    local0\Field2 = 0.0
    local0\Field1 = fps\Field3[$01]
    local0\Field5 = currachvmsgid
    local0\Field4 = XF2FX4F0X2(achievementsimages, arg0)
    currachvmsgid = (currachvmsgid + $01)
    Return local0
    Return Null
End Function
