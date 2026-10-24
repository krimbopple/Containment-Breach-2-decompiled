Function TX4XZ6XBFX4%(arg0$, arg1%)
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
    If (YBF6BXF6X(local0) <> 0) Then
        Y00DFZDDF6(local0)
        Return $00
    EndIf
    local1 = TX22X8622X4(local0, "", "materials")
    If ((XF8BD48Z24(local1) And (filesize(local1) > $00)) <> 0) Then
        loadmaterials(local1)
    EndIf
    local2 = TX22X8622X4(local0, "", "roomtemplates")
    If ((XF8BD48Z24(local2) And (filesize(local2) > $00)) <> 0) Then
        loadroomtemplates(local2)
    EndIf
    local3 = TX22X8622X4(local0, "", "propssettings")
    If ((XF8BD48Z24(local3) And (filesize(local3) > $00)) <> 0) Then
        X226D40BX8(local3)
    EndIf
    Y00DFZDDF6(local0)
    Return $00
End Function
