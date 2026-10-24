Function T6ZFF4D068%(arg0%, arg1%, arg2%, arg3%, arg4%, arg5%, arg6%)
    Local local0%
    Local local1%
    Local local2%
    local0 = countsurfaces(arg0)
    If (((arg2 > $00) And (local0 >= arg2)) <> 0) Then
        local1 = getsurface(arg0, arg2)
        local2 = getsurfacebrush(local1)
        If (local2 <> $00) Then
            brushtexture(local2, arg1, $00, $00)
            brushtexture(local2, arg1, $00, $01)
            brushtexture(local2, arg1, $00, $02)
            brushtexture(local2, arg1, $00, $03)
            brushcolor(local2, (Float arg4), (Float arg5), (Float arg6))
            TZXZZ288XZ(local2, arg3, $00)
            paintsurface(local1, local2)
        EndIf
        freebrush(local2)
        Return $01
    EndIf
    Return $00
    Return $00
End Function
