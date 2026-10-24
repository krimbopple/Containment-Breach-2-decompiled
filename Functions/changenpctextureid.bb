Function changenpctextureid%(arg0.npcs, arg1%)
    Local local0%
    If (arg0 = Null) Then
        openconsoleonerror(getlocalstring("msg", "spawn.invaildtex"))
        Return $00
    EndIf
    If (((arg0\Field29 <> (arg1 + $01)) And (arg1 < $23)) <> 0) Then
        arg0\Field29 = (arg1 + $01)
        local0 = loadtexture_strict((("GFX\NPCs\" + n_i\Field4[arg1]) + ".png"), $01, $00, 1.0)
        entitytexture(arg0\Field98, local0, $00, $00)
        If (arg0\Field77 = $08) Then
            entitytexture(arg0\Field101, local0, $00, $00)
        EndIf
        deletesingletextureentryfromcache(local0, $00)
    EndIf
    Return $00
End Function
