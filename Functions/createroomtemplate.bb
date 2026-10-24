Function createroomtemplate.roomtemplates(arg0$)
    Local local0.roomtemplates
    local0 = (New roomtemplates)
    local0\Field15 = ("GFX\Map\" + arg0)
    local0\Field7 = roomtempid
    roomtempid = (roomtempid + $01)
    Return local0
    Return Null
End Function
