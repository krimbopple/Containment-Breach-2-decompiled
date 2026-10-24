Function initlauncher%()
    Local local0.launcher
    If (opt\Field40 <> 0) Then
        local0 = (New launcher)
        local0\Field3 = countgfxmodes3d()
        updatelauncher(local0)
        Delete local0
    EndIf
    Return $00
End Function
