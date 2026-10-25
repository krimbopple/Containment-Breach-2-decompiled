Function GUESSEDsetfield_5%(arg0.events)
    Local local0.TX2BF6X0FF4
    If (arg0\Field5 <> Null) Then
        local0 = (After arg0\Field5)
    EndIf
    local0 = GUESSEDgetnextevent(arg0, local0)
    If (local0 = Null) Then
        local0 = GUESSEDgetnextevent(arg0, (First TX2BF6X0FF4))
    EndIf
    arg0\Field5 = local0
    If (arg0\Field5 = Null) Then
        arg0\Field5 = TXXF6F02DB2[GUESSEDupdatedropitem()]
    EndIf
    Return $00
End Function
