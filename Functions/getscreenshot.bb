Function getscreenshot%()
    Local local0%
    Local local1%
    If (T2X68D4FB0 > millisecs()) Then
        Return $00
    EndIf
    If (filetype("Screenshots\") <> $02) Then
        createdir("Screenshots")
    EndIf
    savebuffer(backbuffer(), (("Screenshots\Screenshot" + (Str screenshotcount)) + ".png"))
    If (mainmenuopen = $00) Then
        createhintmsg(getlocalstring("msg", "screenshot"), 6.0, $00)
    EndIf
    playsound_strict(loadtempsound("SFX\General\Screenshot.ogg"), $00, $00)
    screenshotcount = (screenshotcount + $01)
    T2X68D4FB0 = (millisecs() + $3E8)
    Return $00
End Function
