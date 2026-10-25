Function GUESSEDloaddocument%(arg0$, arg1%)
    Local local0%
    Local local1$
    Local local2$
    Local local3$
    local0 = $00
    If (arg1 = $00) Then
        
        local0 = eax_0007
    Else
        
        local0 = eax_000F
    EndIf
    If (_JsonHasParseError(local0) <> 0) Then
        _JsonFreeDocument(local0)
        Return $00
    EndIf
    local1 = GUESSEDgetarg1(local0, "", "materials")
    If ((GUESSEDruncmd_2(local1) And (filesize(local1) > $00)) <> 0) Then
        loadmaterials(local1)
    EndIf
    local2 = GUESSEDgetarg1(local0, "", "roomtemplates")
    If ((GUESSEDruncmd_2(local2) And (filesize(local2) > $00)) <> 0) Then
        loadroomtemplates(local2)
    EndIf
    local3 = GUESSEDgetarg1(local0, "", "propssettings")
    If ((GUESSEDruncmd_2(local3) And (filesize(local3) > $00)) <> 0) Then
        GUESSEDopensetting(local3)
    EndIf
    _JsonFreeDocument(local0)
    Return $00
End Function
